package com.hxq.violation.mapper;

import com.hxq.violation.bean.Violation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**罚单持久层Mapper
 * Created by hxq on 2019/5/21.
 */
public interface ViolationMapper {
    /**
     * 添加一个罚单
     * @param violation
     * @return
     */
    public void insertViolation(@Param("violation") Violation violation);

    /**
     * 通过车主的id查询罚单，车主操作
     * @param cId
     * @return
     */
    public List<Violation> findAllByCid(@Param("cId") Integer cId);

    /**
     * 通过车主的名字查询订单
     * @param cName
     * @return
     */
    public  List<Violation> findAllByCname(@Param("cName") String cName);

    /**
     * 通过车牌号查询罚单
     * @param carNumber
     * @return
     */
    public List<Violation> findAllByCarNumber(@Param("carNumber") String carNumber);

    /**
     * 通过id将罚单更新为已支付
     * @param id
     * @return
     */
    public void updateIsPay1(@Param("id") Integer id);

    /**
     * 通过警察的id查找自己开的罚单，用于警察界面查找自己的所有开过的罚单
     * @param pId 警察的id
     * @return罚单集合
     */
    public List<Violation> findAllByPid(@Param("pId") Integer pId);

}
