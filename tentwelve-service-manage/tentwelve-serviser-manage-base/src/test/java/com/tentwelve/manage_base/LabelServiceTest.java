package com.tentwelve.manage_base;

import com.tentwelve.entity.base.BaseLabel;
import com.tentwelve.manage_base.service.BaseLabelService;
import com.tentwelve.model.response.QueryResponseResult;
import com.tentwelve.model.response.ResponseResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class LabelServiceTest {

    @Autowired
    BaseLabelService LabelService;

    @Test
    public void selectPage(){
        QueryResponseResult result = LabelService.queryPage(2,2,null);
        System.out.println(result);
    }

    @Test
    public void save(){
        BaseLabel baseLabel = new BaseLabel();
        baseLabel.setLabelname("test");
        baseLabel.setState("1");
        ResponseResult save = LabelService.save(baseLabel);
    }
}
