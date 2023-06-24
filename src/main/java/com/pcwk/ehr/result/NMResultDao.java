package com.pcwk.ehr.result;

import java.sql.SQLException;
import java.util.List;


public interface NMResultDao {

	public ResultVO getId(ResultVO id) throws SQLException;

	public List<ResultVO> getLuck(ResultVO luck) throws SQLException;

}