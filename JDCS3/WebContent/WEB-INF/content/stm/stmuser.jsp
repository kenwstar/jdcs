<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>UserAction</title>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<h1>这是UserAction对应的user.jsp</h1>
		<s:form action="stmuser" method="post" theme="simple">
			<table width="70%" border="0" align="center" cellpadding="3" cellspacing="0">
				<tr>
					<td class="font_d3">姓名</td>
					<td>
						<s:textfield name="stmUserName" />
					</td>
					<td class="font_d3">角色</td>
					<td>
						<s:select name="stmRoleKey" list="allRoles" listKey="stmRoleKey" listValue="stmRoleName" headerKey="" headerValue="--请选择--" />
					</td>
					<td>
						<input type="submit" value="查询" />
					</td>
				</tr>
			</table>
		</s:form>
		<div>
			<table width="100%" border="0" align="center" cellpadding="3" cellspacing="1">
				<tr align="center">
					<th>序号</th>
					<th>姓名</th>
					<th>角色</th>
					<th>创建时间</th>
					<th>修改时间</th>
				</tr>
				<s:iterator value="list">
					<tr align="center">
						<td>${stmUserKey}</td>
						<td>${stmUserName}</td>
						<td>${stmRole.stmRoleName}</td>
						<td>${crtLog}</td>
						<td>${amdLog}</td>
					</tr>
				</s:iterator>
			</table>
		</div>
		<div>
			<h3><a href="${ctx}/hello.action">返回</a></h3>
		</div>
	</body>
</html>