package com.board.mappers;


import com.board.dto.CalendarDTO;
import com.board.dto.GroupDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalendarMapper {

    void calendar_create(CalendarDTO calendarDTO);

    // 저장
//    void save_data(CalendarDTO calendarDTOS);
    void save (CalendarDTO calendarDTO);
    // 삭제
    void delete_data(CalendarDTO calendarDTO);

    List<CalendarDTO> select_data(int idNo);

    List<CalendarDTO> select_individual_data(int idNo);

    List<CalendarDTO> select_group_data(GroupDTO groupDTO);

    void update_data(CalendarDTO calendarDTO, CalendarDTO oldCalendarDTO);


}
