<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GST Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background:#f8f9fa;
        }
        .container {
            margin-left:50px;
            width:90%;
            border: none;
      border-radius: 10px;
      padding: 20px;
      margin-top: 50px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      background-color:white;
        }
        h5{
        
        color: #10518C;
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            margin-left:25px;
        }
        input[type="text"], input[type="email"], input[type="number"] {
            width: 260px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-left:25px;
            height:5px;
        }
        select{
            width: 300px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-left:25px;
        }
        
        input[type="submit"] {
            background-color: #10518C;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            align:right;
        }
    </style>
</head>
<body>
<div class="header">
<jsp:include page="header.jsp"/>
</div>
    <div class="container">
        <h3 style="color:black;">Surrender /Cancellation GST Application Form | TaxPayer</h3>
        <form action="GstCancellation1">
            <div class="form-group">
                <h4 style="color: #10518C">Select Type Of Business For GSTIN</h4>
                <select id="businessType">
                    <option value="proprietor">Proprietor/Single Owner</option>
                </select>
            </div> 
            <div class="form-group">
             <h5>Business Details</h5>
              <table>
               <tr>
                <td><label for="tradeName">Trade Name of Business</label>
                <input type="text" id="tradeName"  name="tradename" required/></td>
             <td>
                <label for="Gstin"> GSTIN(Optional)</label>
                <input type="text" id="Gstin"  name="Gstin"/>
                </td></tr>
          
            <tr><td><h5>General Details</h5></td>
            <tr>
            <td>
                <label for="firstname">Full name</label>
                <input type="text" id="fullname" name="fullname" required /></td>
         
                <td>
                <label for="emailid">Email Id</label>
                <input type="email" id="emailid" name="emailid" required /></td>
                
               <td> <label for="mobilenumber">Mobile Number</label>
                <input type="text" id="mobilenumber"  name="mobilenumber" required/></td>
                <td><label for="State">State/UT</label>
<select id="countrystate" name="countrystate">
    <option value="">Select state</option>
    <option value="AN">Andaman and Nicobar Islands</option>
    <option value="AP">Andhra Pradesh</option>
    <option value="AR">Arunachal Pradesh</option>
    <option value="AS">Assam</option>
    <option value="BR">Bihar</option>
    <option value="CH">Chandigarh</option>
    <option value="CT">Chhattisgarh</option>
    <option value="DN">Dadra and Nagar Haveli</option>
    <option value="DD">Daman and Diu</option>
    <option value="DL">Delhi</option>
    <option value="GA">Goa</option>
    <option value="GJ">Gujarat</option>
    <option value="HR">Haryana</option>
    <option value="HP">Himachal Pradesh</option>
    <option value="JK">Jammu and Kashmir</option>
    <option value="JH">Jharkhand</option>
    <option value="KA">Karnataka</option>
    <option value="KL">Kerala</option>
    <option value="LA">Ladakh</option>
    <option value="LD">Lakshadweep</option>
    <option value="MP">Madhya Pradesh</option>
    <option value="MH">Maharashtra</option>
    <option value="MN">Manipur</option>
    <option value="ML">Meghalaya</option>
    <option value="MZ">Mizoram</option>
    <option value="NL">Nagaland</option>
    <option value="OR">Odisha</option>
    <option value="PY">Puducherry</option>
    <option value="PB">Punjab</option>
    <option value="RJ">Rajasthan</option>
    <option value="SK">Sikkim</option>
    <option value="TN">Tamil Nadu</option>
    <option value="TG">Telangana</option>
    <option value="TR">Tripura</option>
    <option value="UP">Uttar Pradesh</option>
    <option value="UT">Uttarakhand</option>
    <option value="WB">West Bengal</option>
</select>
</td>
         </tr>
            <tr>
            <td colspan="5"><p>I, the Applicant in the capacity of Himself/Herself do hereby declare that what is stand above is true to the best of my Knowledge of my information and belief.</p>
          </td></tr>
          <tr>
          <td style="color:blue;">
          <input type="checkbox"   required> I Agree all Terms and Conditions
          </td>
          </tr>
             <tr >
             <td colspan="6" align="right">
               <input type="submit" value="Continue" required />
             </td>
             </tr>
            </table>
             </div>   
        </form>
        </div>
  