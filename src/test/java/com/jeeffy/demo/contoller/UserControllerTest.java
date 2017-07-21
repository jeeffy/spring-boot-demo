package com.jeeffy.demo.contoller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jeeffy.demo.BaseTest;
import com.jeeffy.demo.bean.User;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by jiangfeng on 2017/7/18.
 */
public class UserControllerTest extends BaseTest{

    private static Integer id = 1;

    @Test
    public void testList() throws Exception {
        mvc.perform(get("/users"))
                .andDo(print())
                .andExpect(jsonPath("$").isArray());
    }

    @Test
    public void testDetail() throws Exception {
        mvc.perform(get("/users/"+id))
                .andDo(print())
                .andExpect(jsonPath("$.userName").value("admin"));
    }

    @Test
    public void testCreate() throws Exception {
        User user = new User();
        user.setUserAccount("zs");
        user.setUserName("zs");
        user.setUserPswd("123456");
        mvc.perform(post("/users")
                    //.contentType(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                    .content("userAccount=xx&userPswd=zx")
                    //.content(JSON.toJSONString(user))
                    )
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testUpdate() throws Exception {
        User user = new User();
        user.setUserId(119);
        user.setUserAccount("zs12x");
        user.setUserName("张三");
        user.setUserPswd("123456");
        mvc.perform(put("/users/119")
                    //.contentType(MediaType.APPLICATION_JSON)
                    //.content(JSON.toJSONString(user))
                    .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                    //.content("userId=119&userAccount=张三&userPswd=zx")
                    .param("userId", "119")
                    .param("userAccount", "ld")
                )
                .andDo(print())
                .andExpect(status().isOk());
    }



    @Test
    public void testDelete() throws Exception {
        mvc.perform(delete("/users/"+id))
                .andDo(print())
                .andExpect(jsonPath("$").isArray());
    }

}