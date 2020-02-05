package cn.cuitrwx.studyabroadprogramService.dao;

import cn.cuitrwx.studyabroadprogramService.model.programtable;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface userdao {
    programtable getProgramTable(String overseas_study_id);
    List<programtable> getAllProgramTable();
}
