package com.example.a35448.ecthelper.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 35448 on 2017/11/5.
 */

public class student extends DataSupport {
    private int id;

    private String question;/**数据库存放的问题**/
    private String answer;/**数据库存放的答案**/

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getquestion() {
        return question;
    }
    public void setquestion(String question) {
        this.question=question;
    }
    public String getanswer() {
        return answer;
    }
    public void setanswer(String answer) {
        this.answer=answer;
    }

}

