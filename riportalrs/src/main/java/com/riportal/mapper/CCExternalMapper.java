package com.riportal.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.riportal.model.LoginHistory;


@Mapper
public interface CCExternalMapper {
	
@Select("SELECT ID as ID,JSessionID as jSessionId,CCUserId as userId,CCUserName as userName,CCGroupName as userGroup,"
    		+ " LogonTime as logonTime,LogoutTime as logoutTime,CreateTime as createTime,UpdateTime as updateTime " + 
    		"			  FROM [ClaimcenterExternal].[dbo].[ext_ccloginhistory] WHERE CCUserID = #{user}")
public List<LoginHistory> loginHistoryByUser(@Param("user") String user);

}
	    
	    