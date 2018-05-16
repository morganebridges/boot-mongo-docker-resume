import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NavigationPillsComponent } from './navigation-pills.component';

describe('NavigationPillsComponent', () => {
  let component: NavigationPillsComponent;
  let fixture: ComponentFixture<NavigationPillsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NavigationPillsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NavigationPillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
