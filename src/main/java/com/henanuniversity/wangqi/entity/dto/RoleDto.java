package com.henanuniversity.wangqi.entity.dto;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role
 */
public class RoleDto {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   0.用户  1.管理员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.level
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.value
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.level
     *
     * @return the value of role.level
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.level
     *
     * @param level the value for role.level
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.value
     *
     * @return the value of role.value
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.value
     *
     * @param value the value for role.value
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}