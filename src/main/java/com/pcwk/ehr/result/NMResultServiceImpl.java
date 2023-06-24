package com.pcwk.ehr.result;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NMResultServiceImpl implements ResultService {
	final Logger LOG = LogManager.getLogger(getClass());
	
    private ResultDao resultDao;

    @Autowired
    public NMResultServiceImpl(ResultDao resultDao) {
        this.resultDao = resultDao;
	
    }
       
	@Override
	public ResultVO getId(ResultVO search) throws SQLException {
		search.setId("ccjj1002");
		return resultDao.getId(search);
	}

	@Override
	public List<ResultVO> getLuck(ResultVO search) throws SQLException {
		search.setLuck("");
		return resultDao.getLuck(search);
	}

}
