package cn.cuitrwx.studyabroadprogramService.service;

import cn.cuitrwx.studyabroadprogramService.model.DataResponseVO;
import cn.cuitrwx.studyabroadprogramService.model.programtable;

import java.util.List;

public interface StudyAbroadProgramService {
    DataResponseVO<programtable> getProgramTable(String overseas_study_id);
    DataResponseVO<List<programtable>> getAllProgramTable();
}
