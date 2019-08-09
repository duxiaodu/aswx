package com.lzdn.aswxmall.db.dao;

import com.lzdn.aswxmall.db.domain.AswxmallRole;
import com.lzdn.aswxmall.db.domain.AswxmallRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AswxmallRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    long countByExample(AswxmallRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int deleteByExample(AswxmallRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int insert(AswxmallRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int insertSelective(AswxmallRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    AswxmallRole selectOneByExample(AswxmallRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    AswxmallRole selectOneByExampleSelective(@Param("example") AswxmallRoleExample example, @Param("selective") AswxmallRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    List<AswxmallRole> selectByExampleSelective(@Param("example") AswxmallRoleExample example, @Param("selective") AswxmallRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    List<AswxmallRole> selectByExample(AswxmallRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    AswxmallRole selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") AswxmallRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    AswxmallRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    AswxmallRole selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AswxmallRole record, @Param("example") AswxmallRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AswxmallRole record, @Param("example") AswxmallRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AswxmallRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AswxmallRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") AswxmallRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aswxmall_role
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}