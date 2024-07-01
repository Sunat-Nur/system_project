/**
 *
 */
package egovframework.com.cmm.service.impl;

import javax.annotation.Resource;

import com.ibatis.sqlmap.client.SqlMapClient;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
/**
 * EgovComAbstractDAO.java 클래스
 *
 * @author 서준식
 * @since 2011. 9. 23.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자           수정내용
 *  -------    -------------    ----------------------
 *   2011. 9. 23.   서준식        최초 생성
 *   2016. 5. 11.   장동한        myBatis 방식 적용
 * </pre>
 */
public abstract class EgovComAbstractDAO extends EgovAbstractDAO{

	@Resource(name="sqlMapClient")
	public void setSuperSqlMapClient(SqlMapClient sqlMapClient) {
        super.setSuperSqlMapClient(sqlMapClient);
    }
}
