<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="indexStyle.css">
</head>
<body>
	<jsp:include page="header.jsp"/>
	<form action="SaveDataBase">
			<div id="form">
					
				<h2> Fresh GST Application Form | Taxpayer</h2>
				<div id="line"></div>
				
				<div id="inputs">
						
						<h3>Select Type Of Business For GSTIN</h3>
						<select id="BusinessType">
								<option> Proprietor/Single Owner</option>
								<option> Proprietor/Single Owner</option>
								<option> Proprietor/Single Owner</option>
						</select>
						
						<div id="BusinessDetail">
							<h3>Business Details</h3>
							<h4>Trade Name of Business*</h4>
							<input type="text" id="BusinessName" name="BusinessName"/>
						</div>
						<h3> Business Address Details</h3>
						<div id="BusinessDetails"> 
						
							<div id="AddressBlock">
								<h4> Address </h4>
								<input type="text" id="Address" name="Address"/>
							</div>
							
							<div id="PinCodeBlock">
								<h4> Pin Code </h4>
								<input type="text" id="PinCode" name="PinCode"/>
							</div>
							
							<div id="State/UTBlock">
								<h4> State/UT </h4>
								<input type="text" id="State" name="State"/>
							</div>
							
							<div id="DistrictBlock">
								<h4> District </h4>
								<input type="text" id="District" name="District"/>
							</div>
						
						</div>
						
						<br/>
						<h3>Proprietor Details</h3>
						<div id="ProprietorDetails"> 
							<div id="FirstNameBlock">
								<h4> First Name </h4>
								<input type="text" id="FirstName" name="FirstName"/>
							</div>
							
							<div id="LastNameBlock">
								<h4> Last Name </h4>
								<input type="text" id="LastName" name="LastName"/>
							</div>
							
							<div id="DOBBlock">
								<h4> DOB </h4>
								<input type="text" id="DOB" name="DOB"/>
							</div>
							
							<div id="FathersNameBlock">
								<h4> Father's Name </h4>
								<input type="text" id="Fathername" name="Fathername"/>
							</div>
							
							<br/>
						</div>
						
						<div id="overflowELements">
								<div id="EmailBlock">
									<h4> E-mail ID </h4>
									<input type="text" id="EmainID" name="EmainID"/>
								</div>
								
								<div id="MobbileNumberBlock">
									<h4> Mobile Number</h4>
									<input type="text" id="MobileNumber" name="MobileNumber"/>
								</div>
						</div>
						
						<p> I, the Applicant, in the capacity of Himself/Herself do hereby declare that what is stated above is true to the best of my knowledge of my information</p>
						
						<div id="checkbox">
							<input type="checkbox" id="checkBox" name="checkBox"/>
							<h4> I Agree ALL Terms And Conditions</h4>				
						</div>
				</div>
		</div>
		<input type="submit" value="continue" id="submit"/>
	</form>
	
	
</body>
</html>