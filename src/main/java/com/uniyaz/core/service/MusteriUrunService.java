package com.uniyaz.core.service;

import com.uniyaz.core.dao.MusteriUrunDao;
import com.uniyaz.core.domain.MusteriUrun;

import java.util.List;

public class MusteriUrunService {  MusteriUrunDao musteriUrunDao = new MusteriUrunDao();

    public void saveMusteriUrun(MusteriUrun musteriUrun) {
        musteriUrunDao.saveMusteriUrun(musteriUrun);
    }

    public void saveMusteriUrun(List<MusteriUrun> musteriUrunList) {
        musteriUrunDao.saveMusteriUrun(musteriUrunList);
    }

    public List<MusteriUrun> findAllHql() {
        return musteriUrunDao.findAllHql();
    }

    public List<MusteriUrun> findAllByMusteriId(Long musteriId) {
        return musteriUrunDao.findAllByMusteriId(musteriId);
    }

}
