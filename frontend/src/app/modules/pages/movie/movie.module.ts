import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MovieComponent } from './movie/movie.component';
import {HeaderModule} from "../../header/header.module";
import {FooterModule} from "../../footer/footer.module";
import {RouterModule} from "@angular/router";
import {MaterialModule} from "src/app/modules/material/material.module";
import {LoadingPageModule} from "../../loading-page/loading-page.module";



@NgModule({
  declarations: [MovieComponent],
    imports: [
        CommonModule,
        HeaderModule,
        FooterModule,
        RouterModule,
        MaterialModule,
        LoadingPageModule
    ]
})
export class MovieModule { }
