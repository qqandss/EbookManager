package com.henanuniversity.wangqi.entity.dto;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table book_info
 */
public class BookInfoDto {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.id
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   书名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.name
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private String name;

    /**
     * Database Column Remarks:
     *   作者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.author
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private String author;

    /**
     * Database Column Remarks:
     *   分类
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.classify
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Integer classify;

    /**
     * Database Column Remarks:
     *   图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.image
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private String image;

    /**
     * Database Column Remarks:
     *   库存
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.stock
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Integer stock;

    /**
     * Database Column Remarks:
     *   允许最大借阅时长，单位天
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.max_keep
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Integer maxKeep;

    /**
     * Database Column Remarks:
     *   评分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.score
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Integer score;

    /**
     * Database Column Remarks:
     *   位置
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.address
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Long address;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.create_time
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.update_time
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.desc
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.id
     *
     * @return the value of book_info.id
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.id
     *
     * @param id the value for book_info.id
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.name
     *
     * @return the value of book_info.name
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.name
     *
     * @param name the value for book_info.name
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.author
     *
     * @return the value of book_info.author
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.author
     *
     * @param author the value for book_info.author
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.classify
     *
     * @return the value of book_info.classify
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Integer getClassify() {
        return classify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.classify
     *
     * @param classify the value for book_info.classify
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.image
     *
     * @return the value of book_info.image
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.image
     *
     * @param image the value for book_info.image
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.stock
     *
     * @return the value of book_info.stock
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.stock
     *
     * @param stock the value for book_info.stock
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.max_keep
     *
     * @return the value of book_info.max_keep
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Integer getMaxKeep() {
        return maxKeep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.max_keep
     *
     * @param maxKeep the value for book_info.max_keep
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setMaxKeep(Integer maxKeep) {
        this.maxKeep = maxKeep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.score
     *
     * @return the value of book_info.score
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.score
     *
     * @param score the value for book_info.score
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.address
     *
     * @return the value of book_info.address
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Long getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.address
     *
     * @param address the value for book_info.address
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setAddress(Long address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.create_time
     *
     * @return the value of book_info.create_time
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.create_time
     *
     * @param createTime the value for book_info.create_time
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.update_time
     *
     * @return the value of book_info.update_time
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.update_time
     *
     * @param updateTime the value for book_info.update_time
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.desc
     *
     * @return the value of book_info.desc
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.desc
     *
     * @param desc the value for book_info.desc
     *
     * @mbg.generated Thu Apr 01 22:43:30 CST 2021
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}