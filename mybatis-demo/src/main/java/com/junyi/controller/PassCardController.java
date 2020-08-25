package com.junyi.controller;

import com.junyi.dao.PassCardDao;
import com.junyi.dao.StudentDao;
import com.junyi.entity.PassCard;
import com.junyi.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @time: 2020/8/25 16:35
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@RestController
@Slf4j
public class PassCardController {
    @Autowired
    public PassCardDao passCardDao;

    @GetMapping("passcard/{student_id}")
    public PassCard find(@PathVariable("student_id") Integer studentId) {
        PassCard passCard = passCardDao.findByStudentId(studentId);
        log.info(passCard.toString());
        return passCard;
    }
}
