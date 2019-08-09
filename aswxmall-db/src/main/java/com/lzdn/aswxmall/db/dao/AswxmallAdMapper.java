package com.lzdn.aswxmall.db.dao;

import com.lzdn.aswxmall.db.domain.AswxmallAd;
import com.lzdn.aswxmall.db.domain.AswxmallAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AswxmallAdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    long countByExample(AswxmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int deleteByExample(AswxmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int insert(AswxmallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int insertSelective(AswxmallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    AswxmallAd selectOneByExample(AswxmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    AswxmallAd selectOneByExampleSelective(@Param("example") AswxmallAdExample example, @Param("selective") AswxmallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    List<AswxmallAd> selectByExampleSelective(@Param("example") AswxmallAdExample example, @Param("selective") AswxmallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    List<AswxmallAd> selectByExample(AswxmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    AswxmallAd selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") AswxmallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    AswxmallAd selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    AswxmallAd selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AswxmallAd record, @Param("example") AswxmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AswxmallAd record, @Param("example") AswxmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AswxmallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AswxmallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") AswxmallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_ad
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}