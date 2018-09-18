package com.kangxw.spring.first.autowriting;

/**
 * @author kxw10
 * Created on 2018-09-17 14:40.
 */
public class AutoWiringService {
    private AutoWritingDAO autoWritingDAO;

    public AutoWiringService(AutoWritingDAO autoWritingDAO) {
        System.out.println("AutoWiringService.constructor");
        this.autoWritingDAO = autoWritingDAO;
    }


    public void setAutoWritingDAO(AutoWritingDAO autoWritingDAO) {
        System.out.println("AutoWiringService.setAutoWritingDAO");
        this.autoWritingDAO = autoWritingDAO;
    }

    public void say(String word) {
        autoWritingDAO.say(word);
    }
}
