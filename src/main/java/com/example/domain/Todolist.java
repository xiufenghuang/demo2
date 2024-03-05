/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.domain;


import javax.xml.crypto.Data;




public class Todolist {

    private String todothing;

    @Override
    public String toString() {
        return "Todolist{" +
                "todothing='" + todothing + '\'' +
                ", todotime='" + todotime + '\'' +
                ", userid=" + userid +
                ", todostate=" + todostate +
                '}';
    }

    public String getTodothing() {
        return todothing;
    }

    public void setTodothing(String todothing) {
        this.todothing = todothing;
    }

    public String getTodotime() {
        return todotime;
    }

    public void setTodotime(String todotime) {
        this.todotime = todotime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTodostate() {
        return todostate;
    }

    public void setTodostate(Integer todostate) {
        this.todostate = todostate;
    }

    private String todotime;
    private Integer userid;
    private Integer todostate;


}
