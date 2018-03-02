package com.smile.modeldemo.exercise;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Administrator on 2018/2/24    14:13
 */
public class StudentControllerTest extends TestCase {

    StudentController studentController;
    @Mock
    StudentDao studentDao;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        MockitoAnnotations.initMocks(this);
        studentController = new StudentController();
        studentController.setStudentDao(studentDao);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetStudentInfo() {
        Student returnStudent = new Student();
        returnStudent.id = 123;

        returnStudent.name = "mock-user";

        when(studentDao.getStudentInfoFromDB(anyInt())).thenReturn(returnStudent);

        Student student = studentController.getStudentInfo(123);

        assertEquals(student.id, 123);
        assertEquals(student.name, "mock-user");
    }

    public void testGetStudentInfoFromServer() {
        when(studentDao.getStudentInfoFromDB(anyInt())).thenReturn(null);
        Student student = studentController.getStudentInfo(123);
        assertEquals(student.id, 123);
        assertEquals(student.name, "server-user");
    }

    public void testCaptureParam() {
        studentController = mock(StudentController.class);

        //一般用来mock 异步回调
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                int studentId = invocation.getArgument(0);
                System.out.println("studentId=" + studentId);
                assertEquals(666, studentId);
                return null;
            }
        }).when(studentController).getStudentInfo(anyInt());

        studentController.getStudentInfo(666);
    }

}