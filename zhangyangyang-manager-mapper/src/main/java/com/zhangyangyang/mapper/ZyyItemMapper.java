package com.zhangyangyang.mapper;

import com.zhangyangyang.pojo.ZyyItem;
import com.zhangyangyang.pojo.ZyyItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZyyItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    long countByExample(ZyyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    int deleteByExample(ZyyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    int deleteByPrimaryKey(Long sku);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    int insert(ZyyItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    int insertSelective(ZyyItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    List<ZyyItem> selectByExample(ZyyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    ZyyItem selectByPrimaryKey(Long sku);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") ZyyItem record, @Param("example") ZyyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    int updateByExample(@Param("record") ZyyItem record, @Param("example") ZyyItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    int updateByPrimaryKeySelective(ZyyItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zyy_item
     *
     * @mbg.generated Tue May 08 14:59:51 CST 2018
     */
    int updateByPrimaryKey(ZyyItem record);
}