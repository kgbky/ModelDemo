package com.smile.modeldemo.note;

/**
 * Created by Administrator on 2018/2/23    10:25
 */

public class NoteDao {

    public void saveNote(User user, String note) {
        if (user != null && !"".equals(user.id)) {
            System.out.println("save note :" + note);
        }
    }

}
