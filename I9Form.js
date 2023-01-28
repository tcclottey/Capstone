import React, { useState } from 'react';
import axios from 'axios';

const I9Form = () => {
const [formData, setFormData] = useState({
firstName: '',
lastName: '',
middleInitial: '',
ssn: '',
dob: '',
emailAddress: '',
telephoneNumber: '',
address: '',
city: '',
state: '',
zipCode: '',
citizenshipStatus: '',
typeOfIdDoc: '',
identificationDocNo: '',
todaysdate: '',
preparerTranslatorOption: '',
citizenshipDetails: {},
preparerTranslatorDetails: {},
});

const handleChange = (e) => {
if (e.target.name === 'citizenshipStatus') {
setFormData({
...formData,
[e.target.name]: e.target.value,
citizenshipDetails: {
[e.target.value]: true
}
});
} else if (e.target.name === 'preparerTranslator') {
setFormData({
...formData,
[e.target.name]: e.target.value,
preparerTranslatorDetails: {
[e.target.value]: true
}
});
} else {
setFormData({ ...formData, [e.target.name]: e.target.value });
}
};

const handleSubmit = async (e) => {
e.preventDefault();
try {
const res = await axios.post('/api/i9form', formData);
console.log(res.data);
} catch (err) {
console.error(err);
}
};

return (
<form onSubmit={handleSubmit}>
<label>
First Name:
<input
       type="text"
       name="firstName"
       value={formData.firstName}
       onChange={handleChange}
     />
</label>
<br />
<label>
Last Name:
<input
       type="text"
       name="lastName"
       value={formData.lastName}
       onChange={handleChange}
     />
</label>
<br />
<label>
Middle Initial:
<input
       type="text"
       name="middleInitial"
       value={formData.middleInitial}
       onChange={handleChange}
     />
</label>
<br />
<label>
Social Security Number:
<input
       type="text"
       name="ssn"
       value={formData.ssn}
       onChange={handleChange}
     />
</label>
<br />
<label>
Birth Date:
<input
       type="date"
       name="dob"
       value={formData.dob}
       onChange={handleChange}
     />
</label>
<br />
<label>
        Email Address:
        <input
          type="email"
          name="emailAddress"
          value={formData.emailAddress}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        Telephone Number:
        <input
          type="tel"
          name="telephoneNumber"
          value={formData.telephoneNumber}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        Address:
        <input
          type="text"
          name="address"
          value={formData.address}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        City:
        <input
          type="text"
          name="city"
          value={formData.city}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        State:
        <input
          type="text"
          name="state"
          value={formData.state}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        Zip Code:
        <input
          type="text"
          name="zipCode"
          value={formData.zipCode}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        Citizenship Status:
        <select
          name="citizenshipStatus"
          value={formData.citizenshipStatus}
          onChange={handleChange}
        >
          <option value="">Select One</option>
          <option value="usCitizen">US Citizen</option>
          <option value="nonUsCitizen">Non US Citizen</option>
          <option value="permanentResident">Permanent Resident</option>
          <option value="authorizedAlien">Authorized Alien</option>
        </select>
      </label>
      <br />
            {formData.citizenshipStatus === 'nonUsCitizen' && (
        <label>
          Type of ID Document:
          <select
            name="typeOfIdDoc"
            value={formData.typeOfIdDoc}
            onChange={handleChange}
          >
            <option value="">Select One</option>
            <option value="passport">Passport</option>
            <option value="greenCard">Green Card</option>
            <option value="visa">Visa</option>
            <option value="other">Other</option>
          </select>
        </label>
      )}
      <br />
      {formData.citizenshipStatus === 'nonUsCitizen' && (
        <label>
          Identification Document Number:
          <input
            type="text"
            name="identificationDocNo"
            value={formData.identificationDocNo}
            onChange={handleChange}
          />
        </label>
      )}
      <br />
      <label>
        Today's Date:
        <input
          type="date"
          name="todaysdate"
          value={formData.todaysdate}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        Preparer/Translator:
        <select
          name="preparerTranslator"
          value={formData.preparerTranslator}
          onChange={handleChange}
        >
          <option value="">Select One</option>
          <option value="none">None</option>
          <option value="preparer">Preparer</option>
          <option value="translator">Translator</option>
        </select>
      </label>
      <br />
      {formData.preparerTranslator === 'preparer' && (
        <label>
          Preparer's Information:
          <input
            type="text"
            name="preparersInfo"
            value={formData.preparersInfo}
            onChange={handleChange}
          />
        </label>
      )}
      <br />
      {formData.preparerTranslator === 'translator' && (
        <label>
          Translator's Information:
          <input
            type="text"
            name="translatorsInfo"
            value={formData.translatorsInfo}
            onChange={handleChange}
          />
        </label>
      )}
      <br />
      <button type="submit">Submit</button>
    </form>
  );
};

export default I9Form;
