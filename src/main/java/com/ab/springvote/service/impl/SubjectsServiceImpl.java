package com.ab.springvote.service.impl;

import com.ab.springvote.dao.SubjectsDao;
import com.ab.springvote.pojo.Subjects;
import com.ab.springvote.service.SubjectsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author young
 */
@Service
public class SubjectsServiceImpl extends ServiceImpl<SubjectsDao, Subjects>
implements SubjectsService
{
}
