package com.qq110.gmall.service;

import com.qq110.gmall.bean.UmsMember;
import com.qq110.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
