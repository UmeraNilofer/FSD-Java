import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularCalculatorComponent } from './angular-calculator.component';

describe('AngularCalculatorComponent', () => {
  let component: AngularCalculatorComponent;
  let fixture: ComponentFixture<AngularCalculatorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AngularCalculatorComponent]
    });
    fixture = TestBed.createComponent(AngularCalculatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
