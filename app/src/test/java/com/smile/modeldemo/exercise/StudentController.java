package com.smile.modeldemo.exercise;

/**
 * Created by Administrator on 2018/2/24    14:02
 */

public class StudentController {
    private StudentDao studentDao;

    public Student getStudentInfo(int sid) {
        Student student = null;
        if (studentDao != null) {
            student = studentDao.getStudentInfoFromDB(sid);
        }
        if (student == null) {
            student = fetchStudentInfo(sid);
        }
        return student;
    }

    public void setStudentDao(StudentDao dao) {
        this.studentDao = dao;
    }

    private Student fetchStudentInfo(int sid) {
        System.out.println("从网络上获取学生信息");
        Student student = new Student();
        student.name = "server-user";
        student.id = sid;
        return student;
    }
}
