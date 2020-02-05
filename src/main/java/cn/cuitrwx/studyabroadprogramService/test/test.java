package cn.cuitrwx.studyabroadprogramService.test;

import cn.cuitrwx.studyabroadprogramService.model.DataResponseVO;
import cn.cuitrwx.studyabroadprogramService.model.programtable;
import cn.cuitrwx.studyabroadprogramService.service.StudyAbroadProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class test {
    @Autowired
    private StudyAbroadProgramService studyAbroadProgramService;

    @GetMapping("/getProgram")
    DataResponseVO<programtable> getProgramTable(String overseas_study_id) {
        return studyAbroadProgramService.getProgramTable(overseas_study_id);
    }
    @GetMapping("/getAllProgram")
    DataResponseVO<List<programtable>> getAllProgramTable() {
        return studyAbroadProgramService.getAllProgramTable();
    }


}
