package com.test.repository;

import com.test.entity.AvTrackerItem;

import java.util.List;

public interface AvTrackerItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table av_tracker_item
     *
     * @mbggenerated Tue Jan 07 21:19:23 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table av_tracker_item
     *
     * @mbggenerated Tue Jan 07 21:19:23 CST 2020
     */
    int insert(AvTrackerItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table av_tracker_item
     *
     * @mbggenerated Tue Jan 07 21:19:23 CST 2020
     */
    AvTrackerItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table av_tracker_item
     *
     * @mbggenerated Tue Jan 07 21:19:23 CST 2020
     */
    List<AvTrackerItem> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table av_tracker_item
     *
     * @mbggenerated Tue Jan 07 21:19:23 CST 2020
     */
    int updateByPrimaryKey(AvTrackerItem record);
}