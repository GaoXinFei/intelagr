package com.oracle.intelagr.controller;

import com.oracle.intelagr.common.Constants;
import com.oracle.intelagr.common.JsonResult;
import com.oracle.intelagr.entity.Contract;
import com.oracle.intelagr.entity.Peasant;
import com.oracle.intelagr.service.IContractService;
import com.oracle.intelagr.service.IPeasantService;
import com.oracle.intelagr.service.IServialNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/geneLandReg")
public class GeneLandRegController {

    @Autowired
    private IServialNumService servialNumService ;
    @Autowired
    private IPeasantService peasantService ;
    @Autowired
    private IContractService contractService ;
    @RequestMapping("/editInput")
    public String editInput(Map map){
        String pt = servialNumService.getServialNum(Constants.BIZ_TYPE_PT) ;
        map.put("pt",pt) ;
        return "/genelandreg/geneLandRegEdit" ;
    }

    @RequestMapping("/geneLandRegDEdit")
    public String geneLandRegDEdit(){
        return "/genelandreg/geneLandRegDEdit" ;
    }


    @RequestMapping("/peasant")
    @ResponseBody
    public JsonResult peasant(String contratorId){
        Peasant peasant =peasantService.queryById(contratorId) ;
        if(peasant==null){
            return new JsonResult(false,"用户不存在") ;
        }
        Map<String,Object> map = new HashMap<String,Object>() ;
        map.put("contractorCode",peasant.getContractorCode()) ;
        List<Contract> list = contractService.query(map) ;
        JsonResult result = new JsonResult(true) ;
        result.setData(peasant);
        return result;
    }



    @RequestMapping("/list")
    public String list(){
        return "/genelandreg/geneLandRegList"  ;
    }
}
