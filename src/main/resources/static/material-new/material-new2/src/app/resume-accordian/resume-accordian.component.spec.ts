import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResumeAccordianComponent } from './resume-accordian.component';

describe('ResumeAccordianComponent', () => {
  let component: ResumeAccordianComponent;
  let fixture: ComponentFixture<ResumeAccordianComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResumeAccordianComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResumeAccordianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
