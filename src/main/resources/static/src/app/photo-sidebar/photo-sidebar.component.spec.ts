import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhotoSidebarComponent } from './photo-sidebar.component';

describe('PhotoSidebarComponent', () => {
  let component: PhotoSidebarComponent;
  let fixture: ComponentFixture<PhotoSidebarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhotoSidebarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhotoSidebarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
