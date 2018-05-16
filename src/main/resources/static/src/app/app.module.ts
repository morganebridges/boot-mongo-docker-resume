import { BrowserModule } from '@angular/platform-browser';
import {Injectable, NgModule} from '@angular/core';

import { AppComponent } from './app.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { NavigationPillsComponent } from './navigation-pills/navigation-pills.component';
import { ResumeAccordianComponent } from './resume-accordian/resume-accordian.component';
import { PhotoSidebarComponent } from './photo-sidebar/photo-sidebar.component';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    NavigationPillsComponent,
    ResumeAccordianComponent,
    PhotoSidebarComponent
  ],
  imports: [
    BrowserModule,
    NgbModule.forRoot(),
    HttpClientModule,
  ],
  exports: [
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
