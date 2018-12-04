// Modules
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
// Routing
import { AppRoutingModule } from './app-routing.module';

// Services
import {LoggingService} from './services/logging.service';

// Components
import { AppComponent } from './app.component';
import { NavComponent } from './components/nav/nav.component';
import { MainComponent } from './components/main/main.component';
import { NpmComponent } from './components/npm/npm.component';
import { PackageComponent } from './components/package/package.component';
import { CliComponent } from './components/cli/cli.component';
import { TypeScriptComponent } from './components/typescript/typescript.component';
import { AccessComponent } from './components/access/access.component';
import { ClassComponent } from './components/class/class.component';
import { TypesComponent } from './components/types/types.component';
import { DecoratorComponent } from './components/decorator/decorator.component';
import { ModuleComponent } from './components/module/module.component';
import { TemplateComponent } from './components/template/template.component';
import { ComponentComponent } from './components/component/component.component';
import { DirectiveComponent } from './components/directive/directive.component';
import { RoutingComponent } from './components/routing/routing.component';
import { DiComponent } from './components/di/di.component';
import { ServiceComponent } from './components/service/service.component';
import { DatabindingComponent } from './components/databinding/databinding.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { StructuralComponent } from './components/structural/structural.component';
import { NewComponentComponent } from './components/new-component/new-component.component';
import { UserServiceService } from './services/user-service.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    MainComponent,
    NpmComponent,
    PackageComponent,
    CliComponent,
    TypeScriptComponent,
    AccessComponent,
    ClassComponent,
    TypesComponent,
    DecoratorComponent,
    ModuleComponent,
    TemplateComponent,
    ComponentComponent,
    DirectiveComponent,
    RoutingComponent,
    DiComponent,
    ServiceComponent,
    DatabindingComponent,
    PipesComponent,
    StructuralComponent,
    NewComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [LoggingService, UserServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
