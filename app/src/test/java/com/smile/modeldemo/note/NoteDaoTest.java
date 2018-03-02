package com.smile.modeldemo.note;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Administrator on 2018/2/23    10:29
 */
public class NoteDaoTest extends TestCase {

    //使用注解创建对象
    @Mock
    private Login login;

    //每次调用test开头的方法 都会调用setUP和tearDown
    @Before
    public void setUp() throws Exception {
        super.setUp();
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSaveNote() {
        Login login = new MockLoginImpl();
        NoteDao noteDao = new NoteDao();
        noteDao.saveNote(login.login("zj", ""),
                "be happy");
    }

    public void testMockBase() {
        // mock creation
        List mockedList = mock(ArrayList.class);
        // using mock object - it does not throw any "unexpected interaction" exception
        mockedList.add("one");

        mockedList.add("three");
        mockedList.add("three");
        mockedList.add("three");

        mockedList.clear();
    }

    public void testMockStub() {
        List mockedList = mock(ArrayList.class);
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenReturn(1);
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(1));
        System.out.println(mockedList.get(99));

        when(mockedList.get(anyInt())).thenReturn("element");
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(1));
        System.out.println(mockedList.get(99));
    }

    public void testMockInvokeTime() {
        List mockedList = mock(ArrayList.class);
        // using mock object - it does not throw any "unexpected interaction" exception
        mockedList.add("one");

        mockedList.add("three");
        mockedList.add("three");
        mockedList.add("three");

        mockedList.get(1);//没有验证该代码

        mockedList.clear();

        // selective, explicit, highly readable verification
        verify(mockedList).add("one");
        // 验证代码执行的次数 是否和预期一样
        verify(mockedList, times(3)).add("three");
        verify(mockedList).clear();

        // never 表示从未执行该代码
        verify(mockedList, never()).add("never happened");

        //atLeast 最少执行  atMost 最多执行
        verify(mockedList, atLeast(0)).add("two");
        verify(mockedList, atMost(5)).add("three");

        //检查mock 对象是否有没有验证过的操作
//        verifyNoMoreInteractions(mockedList);
//        verifyZeroInteractions(mockedList);
    }

    public void testMockStubMore() {
        //连续调用一个方法时  每次返回值的不同
        when(login.login("zj", "123"))
                .thenReturn(new User("11", "zj"))
                .thenReturn(new User("12", "zj2"))
//                .thenThrow(new RuntimeException())
        ;

        User user;
        for (int i = 0; i < 3; i++) {
            user = login.login("zj", "123");
            System.out.println(user);
        }

    }

    public void testDo() {
        //doAnswer() doNothing()
        doReturn(new User("0", "doReturn"))
//        doThrow(new RuntimeException("do Test"))
                .when(login)
                .login("zj", "123");
        User user = login.login("zj", "134");
        System.out.println(user);
    }

    public void testSpy() {
        LinkedList list = new LinkedList();
        List spy = Mockito.spy(list);
        spy.add("one");
        spy.add("two");
        spy.add("two");

        for (Object object :
                list) {
            System.out.println("list " + object);
        }

        for (Object object :
                spy) {
            System.out.println("spy " + object);
        }

        when(spy.size()).thenReturn(100);
        System.out.println("spy " + spy.get(0));
        System.out.println("spy length " + spy.size());

        verify(spy).add("one");
        verify(spy, times(2)).add("two");
    }
}