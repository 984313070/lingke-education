package com.jk.education.user.service;

import com.jk.education.user.common.interfaces.UserServiceApi;
import com.jk.education.user.common.model.User;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.Optional;

@FeignClient(value = "lingke-education-user-service")
public interface UserService extends UserServiceApi {


}
