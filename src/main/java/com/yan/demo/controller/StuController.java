package com.yan.demo.controller;

import com.yan.demo.controller.dao.StuRepository;
import com.yan.demo.domain.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StuController {
    @Autowired
    private StuRepository stuDao;

    @GetMapping("/api/stu/{id}")
    public Stu getStuInfo(@PathVariable String id) {
        return stuDao.getOne(id);
    }

    @PutMapping("/api/stu")
    public Stu updateById(@RequestBody Stu stu) {
        return stuDao.saveAndFlush(stu);
    }

    @PostMapping("/api/stu")
    public Stu addStu(@RequestBody Stu stu) {
        return stuDao.saveAndFlush(stu);
    }
    @DeleteMapping("/api/stu/{id}")
    public String delete( @PathVariable String id) {
        stuDao.deleteById(id);
        return "ok111111";
    }
}
