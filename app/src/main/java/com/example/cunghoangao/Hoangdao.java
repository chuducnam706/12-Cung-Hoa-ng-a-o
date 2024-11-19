package com.example.cunghoangao;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hoangdao {

    private ArrayList<String> cungHoangDao;

    public Hoangdao(ArrayList<String> cungHoangDao){
    this.cungHoangDao = cungHoangDao;
    }

    public ArrayList<String> getCungHoangDao() {
        return cungHoangDao;
    }

    public void setCungHoangDao(ArrayList<String> cungHoangDao) {
        this.cungHoangDao = cungHoangDao;
    }
}
