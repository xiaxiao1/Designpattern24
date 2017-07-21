package com.xiaxiao.designpattern24.iterator;

import com.xiaxiao.designpattern24.iterator.interfaces.IProject;
import com.xiaxiao.designpattern24.iterator.interfaces.IProjectIterator;
import com.xiaxiao.designpattern24.iterator.interfaces.ProjectIterator;

import java.util.ArrayList;

/**
 * Created by xiaxiao on 2017/6/19.
 */

public class Project implements IProject {

    private ProjectEntry projectEntry;
    private ArrayList<Project> projectEntries = new ArrayList<>();

    public Project(ProjectEntry projectEntry) {
        this.projectEntry = projectEntry;
    }
    public Project() {

    }


    @Override
    public void getInfo() {
        System.out.println(projectEntry.getInfo());
    }

    @Override
    public void add(String name,String num,String cost) {
        ProjectEntry entry = new ProjectEntry(name, num, cost);
        projectEntries.add(new Project(entry));
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectEntries);
    }


    public class ProjectEntry {
        private String name;
        private String num;
        private String cost;

        public ProjectEntry(String name, String num, String cost) {
            this.name = name;
            this.num = num;
            this.cost = cost;
        }


        public String getInfo() {
            return "ProjectEntry{" +
                    "cost='" + cost + '\'' +
                    ", name='" + name + '\'' +
                    ", num='" + num + '\'' +
                    '}';
        }

    }
}

