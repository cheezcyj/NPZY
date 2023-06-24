package com.pcwk.ehr.result;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class NMResultDaoImpl implements ResultDao {
	
	final String NAMESPACE = "com.pcwk.ehr.result";
	final String DOT = ".";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;//DB연결객체

	private final Logger LOG = LogManager.getLogger(getClass());
	
	
	//**** default 생성
	public NMResultDaoImpl() {}


	@Override
	public ResultVO getId(ResultVO resultVO) throws SQLException{
		ResultVO outVO = new ResultVO();

		String statement = NAMESPACE+DOT+"getId";
		LOG.debug("┌─────────┐");
		LOG.debug("│statement│"+statement);
		LOG.debug("└─────────┘");
		LOG.debug("2. param " + resultVO);
		
		outVO = sqlSessionTemplate.selectOne(statement, resultVO);
		
			LOG.debug("3. outVO="+outVO);
	

		return outVO;
	}

	public List<ResultVO> getLuck(ResultVO resultVO) throws SQLException{
		List<ResultVO> list = new ArrayList<ResultVO>();

		String statement = NAMESPACE+DOT+"getLuck";
		LOG.debug("┌─────────┐");
		LOG.debug("│statement│"+statement);
		LOG.debug("└─────────┘");
		LOG.debug("2. param " + resultVO);
		
		list = sqlSessionTemplate.selectList(statement, resultVO);
		for (ResultVO vo : list) {
			LOG.debug("3. vo="+vo);
		}

		return list;

		}
	
}
