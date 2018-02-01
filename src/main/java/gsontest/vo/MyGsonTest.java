package gsontest.vo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Nzm on 2018/1/22.
 */
public class MyGsonTest {

    private String name;

    private Integer age;

    private String dateString;

    private Date dateDate;

    private LocalDateTime dateLocal;

    @Override
    public String toString() {
        return "MyGsonTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateString='" + dateString + '\'' +
                ", dateDate=" + dateDate +
                ", dateLocal=" + dateLocal +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public Date getDateDate() {
        return dateDate;
    }

    public void setDateDate(Date dateDate) {
        this.dateDate = dateDate;
    }

    public LocalDateTime getDateLocal() {
        return dateLocal;
    }

    public void setDateLocal(LocalDateTime dateLocal) {
        this.dateLocal = dateLocal;
    }
}
