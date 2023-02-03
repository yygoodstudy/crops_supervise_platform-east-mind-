package com.example.oop;

public class Teacher extends SchoolWorker {

    public void teach() {
        System.out.println(this.getName() + "正在讲课~");
    }

    public void assignHomework() {
        System.out.println(this.getName() + "正在布置作业~~");
    }

    public void callTheRoll() {
        System.out.println(this.getName() + "正在点名~~~");
    }
}
