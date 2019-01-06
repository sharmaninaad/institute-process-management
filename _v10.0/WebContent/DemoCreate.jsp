<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Contact V4</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min_c.css">
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util_c.css">
	<link rel="stylesheet" type="text/css" href="css/main_c.css">
</head>
<body>
<form action="createit" method="post">


	<div class="container-contact100">
		<div class="wrap-contact100">
			<form class="contact100-form validate-form">
				<span class="contact100-form-title">
				</span>

				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<span class="label-input100">Process Name</span>
					<input class="input100" type="text" name="process" placeholder="Enter Process Name">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
					<span class="label-input100">Process Description</span>
					<input class="input100" type="text" name="description" placeholder="Enter Process Description">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 input100-select">
					<span class="label-input100"> Select number of Permission levels</span>
					<div>
						<select class="selection-2""on-2" name="permission">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							
						</select>
					</div>
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 input100-select">
					<span class="label-input100">Permission level 1 </span>
					<div>
						<select class="selection-2" name="level1">
							  <option disabled selected value="-1">Please select value</option>
							      <option value="1">DIRECTOR</option>
							      <option value="2">DOAA</option>
							      <option value="3">DOSA</option>
							      <option value="4">CARE-TAKER GH</option>
							      <option value="5">ASSISTANT REGISTRAR</option>
							      <option value="6">REGISTRAR</option>
							      <option value="7">CHEIF WARDEN</option>
							      <option value="8">CARE-TAKER BH1</option>
							      <option value="9">CARE-TAKER BH2</option>
							      <option value="10">CARE-TAKER BH3</option>
							      <option value="11">CARE-TAKER GH</option>
							      <option value="12">OTHER</option>						
     						 </select>
					<span class="focus-input100"></span>
					</div>
						<div class="wrap-input100 input100-select">
					<span class="label-input100">Permission level 2 </span>
					<div>
						<select class="selection-2" name="level2">
							  <option disabled selected value="-1">Please select value</option>
      <option value="1">DIRECTOR</option>
      <option value="2">DOAA</option>
      <option value="3">DOSA</option>
      <option value="4">CARE-TAKER GH</option>
      <option value="5">ASSISTANT REGISTRAR</option>
      <option value="6">REGISTRAR</option>
      <option value="7">CHEIF WARDEN</option>
      <option value="8">CARE-TAKER BH1</option>
      <option value="9">CARE-TAKER BH2</option>
      <option value="10">CARE-TAKER BH3</option>
      <option value="11">CARE-TAKER GH</option>
      <option value="12">OTHER</option>						
      </select>
					<span class="focus-input100"></span>
					</div>
						<div class="wrap-input100 input100-select">
					<span class="label-input100">Permission level 3 </span>
					<div>
						<select class="selection-2" name="level3">
							  <option disabled selected value="-1">Please select value</option>
      <option value="1">DIRECTOR</option>
      <option value="2">DOAA</option>
      <option value="3">DOSA</option>
      <option value="4">CARE-TAKER GH</option>
      <option value="5">ASSISTANT REGISTRAR</option>
      <option value="6">REGISTRAR</option>
      <option value="7">CHEIF WARDEN</option>
      <option value="8">CARE-TAKER BH1</option>
      <option value="9">CARE-TAKER BH2</option>
      <option value="10">CARE-TAKER BH3</option>
      <option value="11">CARE-TAKER GH</option>
      <option value="12">OTHER</option>						
      </select>
					<span class="focus-input100"></span>
					</div>
						<div class="wrap-input100 input100-select">
					<span class="label-input100">Permission level 4 </span>
					<div>
						<select class="selection-2" name="level4">
							  <option disabled selected value="-1">Please select value</option>
      <option value="1">DIRECTOR</option>
      <option value="2">DOAA</option>
      <option value="3">DOSA</option>
      <option value="4">CARE-TAKER GH</option>
      <option value="5">ASSISTANT REGISTRAR</option>
      <option value="6">REGISTRAR</option>
      <option value="7">CHEIF WARDEN</option>
      <option value="8">CARE-TAKER BH1</option>
      <option value="9">CARE-TAKER BH2</option>
      <option value="10">CARE-TAKER BH3</option>
      <option value="11">CARE-TAKER GH</option>
      <option value="12">OTHER</option>						
      </select>
					<span class="focus-input100"></span>
					</div>
						<div class="wrap-input100 input100-select">
					<span class="label-input100">Permission level 5 </span>
					<div>
						<select class="selection-2" name="level5">
							  <option disabled selected value="-1">Please select value</option>
      <option value="1">DIRECTOR</option>
      <option value="2">DOAA</option>
      <option value="3">DOSA</option>
      <option value="4">CARE-TAKER GH</option>
      <option value="5">ASSISTANT REGISTRAR</option>
      <option value="6">REGISTRAR</option>
      <option value="7">CHEIF WARDEN</option>
      <option value="8">CARE-TAKER BH1</option>
      <option value="9">CARE-TAKER BH2</option>
      <option value="10">CARE-TAKER BH3</option>
      <option value="11">CARE-TAKER GH</option>
      <option value="12">OTHER</option>						
      </select>
					<span class="focus-input100"></span>
					</div>
						<div class="wrap-input100 input100-select">
					<span class="label-input100">Permission level 6</span>
					<div>
						<select class="selection-2" name="level6">
							  <option disabled selected value="-1">Please select value</option>
      <option value="1">DIRECTOR</option>
      <option value="2">DOAA</option>
      <option value="3">DOSA</option>
      <option value="4">CARE-TAKER GH</option>
      <option value="5">ASSISTANT REGISTRAR</option>
      <option value="6">REGISTRAR</option>
      <option value="7">CHEIF WARDEN</option>
      <option value="8">CARE-TAKER BH1</option>
      <option value="9">CARE-TAKER BH2</option>
      <option value="10">CARE-TAKER BH3</option>
      <option value="11">CARE-TAKER GH</option>
      <option value="12">OTHER</option>						
      </select>
					<span class="focus-input100"></span>
					</div>
					
					
				

				<div class="container-contact100-form-btn">
					<div class="wrap-contact100-form-btn">
						<div class="contact100-form-bgbtn"></div>
						<button class="contact100-form-btn">
							<span>
								Create Process

							</span>
						</button>
					</div>
				</div>

		</div>
	</div>



	<div id="dropDownSelect1"></div>

</form>
</body>
</html>
