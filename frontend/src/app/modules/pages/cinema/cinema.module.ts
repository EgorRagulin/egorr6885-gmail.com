import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CinemaComponent } from './cinema/cinema.component';
import {RouterModule} from "@angular/router";
import {MaterialModule} from "../../material/material.module";
import {LoadingPageModule} from "../../loading-page/loading-page.module";



@NgModule({
  declarations: [CinemaComponent],
    imports: [
        CommonModule,
        RouterModule,
        MaterialModule,
        LoadingPageModule
    ]
})
export class CinemaModule { }
