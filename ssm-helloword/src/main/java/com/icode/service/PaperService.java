package com.icode.service;

import com.icode.pojo.Paper;

import java.util.List;

/**
 * @author Unicorn
 */
public interface PaperService {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}

