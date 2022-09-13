import React from 'react';
import {
  MDBBtn,
  MDBContainer,
  MDBCard,
  MDBCardBody,
  MDBInput,
  MDBCheckbox
}
from 'mdb-react-ui-kit';

export default function AddMenu() {
  return (
    <MDBContainer fluid className='d-flex align-items-center justify-content-center bg-image' >
      <div className='mask gradient-custom-3'></div>
      <MDBCard className='m-5' style={{maxWidth: '600px'}}>
        <MDBCardBody className='px-5'>
          <h2 className="text-uppercase text-center mb-5">Update-Menu</h2>
          <MDBInput wrapperClass='mb-4' label='TiffinName' size='lg' id='tiffin_name' type='text'/>
          <MDBInput wrapperClass='mb-4' label='TiffinImage' size='lg' id='tiffin_image' type='image'/>
          <MDBInput wrapperClass='mb-4' label='TiffinPriceMonth' size='lg' id='tiffin_price_month' type='double'/>         
          <MDBInput wrapperClass='mb-4' label='Description' size='lg' id='description' type='text'/>
          <MDBBtn className='mb-4 w-100 gradient-custom-4' size='lg'>UpdateMenu</MDBBtn>
        </MDBCardBody>
      </MDBCard>
    </MDBContainer>
  );
}
