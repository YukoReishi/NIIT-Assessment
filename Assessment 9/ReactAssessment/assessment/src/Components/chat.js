import React from "react";
import {
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBCard,
    MDBCardBody,
    MDBIcon,
    MDBBtn,
    MDBTypography,
    MDBTextArea,
    MDBCardHeader,
} from "mdb-react-ui-kit";

import logo from './image/logo.png'

export default function Chat() {

    const senderName = "Arun"

    return (
        <MDBContainer fluid className="py-5" style={{ backgroundColor: "#eee" }}>
            <MDBRow>
                <MDBCol md="6" lg="5" xl="4" className="mb-4 mb-md-0">
                    <MDBCard>
                        <MDBCardBody>
                            <MDBTypography listUnStyled className="mb-0">
                                <li
                                    className="p-2 border-bottom"
                                    style={{ backgroundColor: "#eee" }}
                                >
                                    <a href="#!" className="d-flex justify-content-between">
                                        <div className="d-flex flex-row">
                                            <img
                                                src={logo}
                                                alt="avatar"
                                                className="rounded-circle d-flex align-self-center me-3 shadow-1-strong"
                                                width="60"
                                            />
                                            <div className="pt-1">
                                                <p className="fw-bold mb-0">Vishal</p>
                                            </div>
                                        </div>
                                        <div className="pt-1">
                                            <p className="small text-muted mb-1">Just now</p>
                                            <span className="badge bg-danger float-end">1</span>
                                        </div>
                                    </a>
                                </li>
                                <li className="p-2 border-bottom">
                                    <a href="#!" className="d-flex justify-content-between">
                                        <div className="d-flex flex-row">
                                            <img
                                                src={logo}
                                                alt="avatar"
                                                className="rounded-circle d-flex align-self-center me-3 shadow-1-strong"
                                                width="60"
                                            />
                                            <div className="pt-1">
                                                <p className="fw-bold mb-0">Ram Chandu</p>
                                            </div>
                                        </div>
                                        <div className="pt-1">
                                            <p className="small text-muted mb-1">5 mins ago</p>
                                        </div>
                                    </a>
                                </li>
                                <li className="p-2 border-bottom">
                                    <a href="#!" className="d-flex justify-content-between">
                                        <div className="d-flex flex-row">
                                            <img
                                                src={logo}
                                                alt="avatar"
                                                className="rounded-circle d-flex align-self-center me-3 shadow-1-strong"
                                                width="60"
                                            />
                                            <div className="pt-1">
                                                <p className="fw-bold mb-0">Anmol</p>
                                            </div>
                                        </div>
                                        <div className="pt-1">
                                            <p className="small text-muted mb-1">Yesterday</p>
                                        </div>
                                    </a>
                                </li>
                                <li className="p-2 border-bottom">
                                    <a href="#!" className="d-flex justify-content-between">
                                        <div className="d-flex flex-row">
                                            <img
                                                src={logo}
                                                alt="avatar"
                                                className="rounded-circle d-flex align-self-center me-3 shadow-1-strong"
                                                width="60"
                                            />
                                            <div className="pt-1">
                                                <p className="fw-bold mb-0">Ashutosh</p>
                                            </div>
                                        </div>
                                        <div className="pt-1">
                                            <p className="small text-muted mb-1">Yesterday</p>
                                        </div>
                                    </a>
                                </li>
                                <li className="p-2 border-bottom">
                                    <a href="#!" className="d-flex justify-content-between">
                                        <div className="d-flex flex-row">
                                            <img
                                                src={logo}
                                                alt="avatar"
                                                className="rounded-circle d-flex align-self-center me-3 shadow-1-strong"
                                                width="60"
                                            />
                                            <div className="pt-1">
                                                <p className="fw-bold mb-0">Kanishk</p>
                                            </div>
                                        </div>
                                        <div className="pt-1">
                                            <p className="small text-muted mb-1">Yesterday</p>
                                        </div>
                                    </a>
                                </li>
                                <li className="p-2 border-bottom">
                                    <a href="#!" className="d-flex justify-content-between">
                                        <div className="d-flex flex-row">
                                            <img
                                                src={logo}
                                                alt="avatar"
                                                className="rounded-circle d-flex align-self-center me-3 shadow-1-strong"
                                                width="60"
                                            />
                                            <div className="pt-1">
                                                <p className="fw-bold mb-0">Rajasekhar</p>
                                            </div>
                                        </div>
                                        <div className="pt-1">
                                            <p className="small text-muted mb-1">Yesterday</p>
                                        </div>
                                    </a>
                                </li>
                                <li className="p-2">
                                    <a href="#!" className="d-flex justify-content-between">
                                        <div className="d-flex flex-row">
                                            <img
                                                src={logo}
                                                alt="avatar"
                                                className="rounded-circle d-flex align-self-center me-3 shadow-1-strong"
                                                width="60"
                                            />
                                            <div className="pt-1">
                                                <p className="fw-bold mb-0">Arun</p>
                                            </div>
                                        </div>
                                        <div className="pt-1">
                                            <p className="small text-muted mb-1">5 mins ago</p>
                                            <span className="text-muted float-end">
                                                <MDBIcon fas icon="check" />
                                            </span>
                                        </div>
                                    </a>
                                </li>
                            </MDBTypography>
                        </MDBCardBody>
                    </MDBCard>
                </MDBCol>

                <MDBCol md="6" lg="7" xl="8">
                    <MDBTypography listUnStyled>
                        <li className="d-flex justify-content-between mb-4">
                            <MDBCard>
                                <MDBCardHeader className="d-flex justify-content-between p-3">
                                    <p className="fw-bold mb-0">{senderName}</p>
                                    <p className="text-muted small mb-0">
                                        <MDBIcon far icon="clock" /> 14 mins ago
                                    </p>
                                </MDBCardHeader>
                                <MDBCardBody>
                                    <p className="mb-0">Hii !</p>
                                </MDBCardBody>
                            </MDBCard>
                        </li>
                        <li class="d-flex justify-content-between mb-4">
                            <MDBCard className="w-100">
                                <MDBCardHeader className="d-flex justify-content-between p-3">
                                    <p class="fw-bold mb-0"></p>
                                    <p class="text-muted small mb-0">
                                        <MDBIcon far icon="clock" /> 13 mins ago
                                    </p>
                                </MDBCardHeader>
                                <MDBCardBody>
                                    <p className="mb-0">Hii</p>
                                </MDBCardBody>
                            </MDBCard>
                            {/* <img
                                src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/avatar-5.webp"
                                alt="avatar"
                                className="rounded-circle d-flex align-self-start ms-3 shadow-1-strong"
                                width="60"
                            /> */}
                        </li>
                        <li className="d-flex justify-content-between mb-4">
                            <MDBCard>
                                <MDBCardHeader className="d-flex justify-content-between p-3">
                                    <p className="fw-bold mb-0">{senderName}</p>
                                    <p className="text-muted small mb-0">
                                        <MDBIcon far icon="clock" /> 10 mins ago
                                    </p>
                                </MDBCardHeader>
                                <MDBCardBody>
                                    <p className="mb-0"> How's your work goin? </p>
                                </MDBCardBody>
                            </MDBCard>
                        </li>
                        <li className="bg-white mb-3">
                            <MDBTextArea label="Message" id="textAreaExample" rows={4} />
                        </li>
                        <MDBBtn color="info" rounded className="float-end">
                            Send
                        </MDBBtn>
                    </MDBTypography>
                </MDBCol>
            </MDBRow>
        </MDBContainer>
    );
}