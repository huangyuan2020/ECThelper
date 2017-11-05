package com.example.a35448.ecthelper.db;

import org.litepal.crud.DataSupport;

import java.net.PortUnreachableException;

/**
 * Created by 35448 on 2017/11/5.
 */

public class teacher extends DataSupport{
    private int id;

    private String Uquestion;/**待回答的问题**/
    private String Tanswer;/**回答的答案**/

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getUquestion() {
        return Uquestion;
    }
    public void setUquestion(String Uquestion) {
        this.Uquestion=Uquestion;
    }
    public String getTanswer() {
        return Tanswer;
    }
    public void setTanswer(String Tanswer) {
        this.Tanswer=Tanswer;
    }

}
