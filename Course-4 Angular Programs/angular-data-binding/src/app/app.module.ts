import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { StringInterpolationComponent } from './string-interpolation/string-interpolation.component';
import { PropertyBindingComponent } from './property-binding/property-binding.component';
import { EventBindingComponent } from './event-binding/event-binding.component';
import { TemplateReferenceComponent } from './template-reference/template-reference.component';
import { AngularCalculatorComponent } from './angular-calculator/angular-calculator.component';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';

@NgModule({
  declarations: [
    AppComponent,
    StringInterpolationComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TemplateReferenceComponent,
    AngularCalculatorComponent,
    TwoWayBindingComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
