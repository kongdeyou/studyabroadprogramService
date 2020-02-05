package cn.cuitrwx.studyabroadprogramService.service.ImpI;

import cn.cuitrwx.studyabroadprogramService.dao.userdao;
import cn.cuitrwx.studyabroadprogramService.model.DataResponseVO;
import cn.cuitrwx.studyabroadprogramService.model.programtable;
import cn.cuitrwx.studyabroadprogramService.mybatisutil.mybatisutil;
import cn.cuitrwx.studyabroadprogramService.service.StudyAbroadProgramService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyAbroadProgramServiceImpI implements StudyAbroadProgramService {
    userdao dao = mybatisutil.getSqlSession().getMapper(userdao.class);

    @Override
    public DataResponseVO<List<programtable>> getAllProgramTable() {
        return new DataResponseVO<>(dao.getAllProgramTable());
    }

    @Override
    public DataResponseVO<programtable> getProgramTable(String overseas_study_id) {
        return new DataResponseVO<>(dao.getProgramTable(overseas_study_id));
    }
}
